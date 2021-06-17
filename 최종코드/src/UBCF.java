// User Based Collaborative Filtering
import java.lang.Math;
import java.sql.SQLException;
import java.util.*;



public class UBCF {
	ConnectSQL connectsql=new ConnectSQL();
//	String user_name;
//	static String[] place= {"까치네","소반","비일","신내떡","베스트프렌드","쏘핫","바보네"};
//	static String[] user={"나연","연주","민지","세은", "나난"};
//	static double[][] array={{0,3,4,2,5,3,1},
//							{5,3,1,4,1,2,4},
//							{4,2,2,3,2,0,1},
//							{0,2,4,2,0,0,0},
//							{5,0,2,4,3,0,2}};
	// 배열 안에 값 넣기!
	public String user_name=null;
	static String[] place=null;//movie.title
	static String[] user=null;//member.name
	static double[][] array=null;//watched에서 id(uid), M#(Mnum) 조인 후 rate 적기//watched에서 id(uid), M#(Mnum) 조인 후 rate 적기
	public int movie_num, member_num;
	static double[][] filtered_array;
	public String ID;
	
	///////////////
	public void printarray(String[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	}
	public void printarray(double[][] arr) {
		for (int i=0;i<arr.length;i++) {
			for (int k=0;k<arr[0].length;k++) {
				System.out.print(arr[i][k]);
				System.out.print(", ");
			}
			System.out.println();
		}
	}
	////////////////
	
	public UBCF(String tfID) {
		this.ID=tfID;
		try {
			//초기화
			this.user_name=connectsql.getNameById(tfID);
			this.movie_num=connectsql.getMovieNum();
			this.member_num=connectsql.getMemberNum();
			this.place=connectsql.getMovieList();
			this.user=connectsql.getMemberList();
			array=new double[user.length][place.length];
			this.array=connectsql.getRatingByIDandMnum();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		filtered_array=new double[user.length][user.length];
	}
	// 사용자 클래스가 12개 있고, 그 안에서 추천하는거!
	
	
	// 코사인 유사도 생성 후 삽입
	public void filtering() {
		for (int i=0;i<user.length;i++) {
			for (int j=i+1;j<user.length;j++) {
				double square_sum1=0;
				double square_sum2=0;
				double dot_product=0;
				double total=0;
				
				for (int k=0;k<place.length;k++) {
					square_sum1+=Math.pow(array[i][k],2);
					square_sum2+=Math.pow(array[j][k],2);
					dot_product+=array[i][k]*array[j][k];
				}
				square_sum1=Math.sqrt(square_sum1);
				square_sum2=Math.sqrt(square_sum2);
				total=dot_product/(square_sum1*square_sum2);
				filtered_array[i][j]=Math.round(total*1000)/1000.0;
				filtered_array[j][i]=Math.round(total*1000)/1000.0;
			}
			filtered_array[i][i]=-1;
		}
		
	}
	
	//array 출력하는 함수
	public void print_array(double[][] array) {
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	//filtered_array 출력하는 함수
	public void print_filtered_array() {
		for (int i=0;i<user.length;i++) {
			for (int j=0;j<user.length;j++) {
				System.out.print(filtered_array[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void print_1darray(double[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	}
	public void print_1darray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	}
	public void print_1darray(String[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	}
	
	
	
	public int find_index_by_value(double[] arr, double val) {
		for (int i=0;i<arr.length;i++) {
			if (val==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public void Array_Copy(double[][] arr, double[][] arr_copy){
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
            	arr_copy[i][j] = arr[i][j];  
            }
        }
	}
	public void Array_Copy(double[] arr, double[] arr_copy){
        for(int i=0; i<arr.length; i++) {
            arr_copy[i] = arr[i];  
        }
	}
	public void rank_slice(String user_name, int rank) {
		//double[][] filtered_array_copy=Arrays.copyOf(filtered_array,filtered_array.length);
		double[][] filtered_array_copy=new double[filtered_array.length][filtered_array.length];
		
		//복사
		Array_Copy(filtered_array, filtered_array_copy);
		int idx=connectsql.find_index_by_user(user_name);
		
		System.out.println(idx);
		
		double[] cs_between_user_array=filtered_array_copy[idx];
		double[] cs_between_user_array_idxing=filtered_array[idx];
		
		//내림차순 정렬
		Arrays.sort(cs_between_user_array);
		int arr_len=cs_between_user_array.length;
		
		//상위 rank개 출력
		int[] idx_list=new int[rank];
		for (int i=arr_len-1;i>arr_len-rank-1;i--) {
			idx_list[i-arr_len+rank]=find_index_by_value(cs_between_user_array_idxing, cs_between_user_array[i]);
		}
		for (int i=idx_list.length-1;i>=0;i--) {
			// 높은 거 리스트 : idx_list[i]
			System.out.println(user[idx_list[i]]);
		}
	}
	public int[] Unseen(String user_name) {
		int[] Unseenlist=new int[place.length];
		int idx=connectsql.find_index_by_user(user_name);
		double[] array_user=array[idx];
		for (int i=0;i<array_user.length;i++) {
			if (array_user[i]==0.0) {
				Unseenlist[i]=1;
			}else {
				Unseenlist[i]=0;
			}
		}
		return Unseenlist;
	}
	// 가장 큰 값을 가진 인덱스 반환(세로 열 기준)
	public int returnMaxvalIdx(double[][] array_copy, int column_idx) {
		//vallist : 세로 열을 가로 어레이로 데려옴
		double[] vallist=new double[user.length];
		double[] vallist_indexing=new double[user.length];
		for (int i=0;i<user.length;i++) {
			vallist[i]=array_copy[i][column_idx];
			vallist_indexing[i]=array_copy[i][column_idx];
		}
		Arrays.sort(vallist);
		int idx=find_index_by_value(vallist_indexing, vallist[vallist.length-1]);
		return idx;
	}
	
	
	// 평점 예측
	/*
	 * 1. 특정 유저에 대한 다른 유저들의 유사도 array 필요
	 * 2. 평점 있는 이차원 배열에 각 값 곱하기(행별-사용자)
	 * 3. 특정 유저가 0의 값을 가지는 배열에서 행별 최대값 구해서 sort(행별-영화)
	 * 4. 앞에서부터 세 개 제목 가져오기!
	 * */
	
	public String[] predictRating(String user_name) {

		//double[][] filtered_array_copy=Arrays.copyOf(filtered_array,filtered_array.length);
		double[][] filtered_array_copy=new double[filtered_array.length][filtered_array[0].length];
		double[][] array_copy=new double[array.length][array[0].length];
		
		//복사
		Array_Copy(array, array_copy);
		Array_Copy(filtered_array, filtered_array_copy);
		
		int idx=connectsql.find_index_by_user(user_name);
		System.out.println(idx);
		
		//유사도 array(원래 순서)
		double[] cs_between_user_array=filtered_array_copy[idx];

		//array_copy에 유사도 곱한 평점 값 넣기
		for (int i=0;i<user.length;i++) {
			for (int j=0;j<place.length;j++) {
				array_copy[i][j]*=cs_between_user_array[i];
			}
		}
		//print_array(array_copy);
		
		//특정 유저가 0의 값을 가지는 배열(0이면 1, 그 외는 0)-> 길이는 영화!
		int[] Unseenlist=Unseen(user_name);
		//안 본 것 개수
		int count=0;
		for (int i=0;i<Unseenlist.length;i++) {
			if (Unseenlist[i]==1) {
				count+=1;
			}
		}
		
		// idx가 0인 친구들로만 이루어진 이차원 배열 생성(행 : 유저, 열 : 특정 사용자가 보지 않은 영화, 값 : array_copy)
		double[][] UnseenArray=new double[user.length][count];
		int j=0;
		for (int m=0;m<user.length;m++) {
			for (int i=0;i<Unseenlist.length;i++) {
				// 안 본 영화!
				if (Unseenlist[i]==1) {				
					UnseenArray[m][j]=array_copy[m][i];
					j+=1;		
				}
			}
			j=0;
		}
		//print_array(UnseenArray);
		
		// 열별(영화별) 최대값 1차원 배열로(열 : 특정 사용자가 보지 않은 영화)
		double[] max_rating_of_movies=new double[count];
		double[] max_rating_of_movies_copy=new double[count];
		String[] unseen_movies=new String[count];
		int k=0;
		for (int m=0;m<count;m++) {
			for (int i=0;i<Unseenlist.length;i++) {
				// 안 본 영화!
				if (Unseenlist[i]==1) {				
					int user_idx=returnMaxvalIdx(array_copy, i);
					max_rating_of_movies[k]=array_copy[user_idx][i];
					unseen_movies[k]=place[i];
					k+=1;		
				}
			}
			k=0;
		}
		Array_Copy(max_rating_of_movies, max_rating_of_movies_copy);
		Arrays.sort(max_rating_of_movies);
		
		String[] mlist=new String[3];;
		// 위의 배열 sort 해서 findindexbyvalue해서 프린트하기!!
		int movies_len=max_rating_of_movies.length;
		if (movies_len>=3) {
			for (int i=movies_len-1;i>movies_len-4;i--) {
				double val=max_rating_of_movies[i];
				int movie_idx=find_index_by_value(max_rating_of_movies_copy, val);
				mlist[i-movies_len+3]=unseen_movies[movie_idx];
				//System.out.println(unseen_movies[movie_idx]);
			}
			return mlist;
		}
		else if (movies_len==2) {
			for (int i=movies_len-1;i>movies_len-3;i--) {
				double val=max_rating_of_movies[i];
				int movie_idx=find_index_by_value(max_rating_of_movies_copy, val);
				mlist[i-movies_len+3]=unseen_movies[movie_idx];
				//System.out.println(unseen_movies[movie_idx]);
			}
			return mlist;
		}
		else if (movies_len==1) {
			for (int i=movies_len-1;i>movies_len-2;i--) {
				double val=max_rating_of_movies[i];
				int movie_idx=find_index_by_value(max_rating_of_movies_copy, val);
				mlist[i-movies_len+3]=unseen_movies[movie_idx];
				//System.out.println(unseen_movies[movie_idx]);
			}
			return mlist;
		}
		else {
			System.out.println("추천할 영화가 없습니다.");
		}
		return mlist;
	}

}
