package Sorting;

import java.util.Arrays;

public class ArrayList {
	private Object[] data;
	private int count = 0;
	private final int FIXED_SIZE = 10;

	public ArrayList() {
		data = new Object[this.FIXED_SIZE];
	}
        
	public Object get(int index) {
		if (index < count) {
			return data[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(Object obj) {
		if (data.length - count <= data.length / 2) {
			this.reSizeArray();
		}

		data[count++] = obj;
	}

	public Object remove(int index) {
		if (index < count) {
			Object obj = data[index];
			int temp = index;
			data[index] = null;

			while (temp < count) {
				data[temp] = data[temp + 1];
				data[temp + 1] = null;
				temp++;
			}

			count--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * Resizing the array
	 */
	public void reSizeArray() {
		data = Arrays.copyOf(data, data.length * 2);
	}

	public int size() {
		return count;
	}
        void printArray(int arr[]){
            int n = arr.length;
            System.out.println("Hasil Sorting : ");
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
        public void selection(int data[]){
            for(int i = 0; i < data.length-1; i++){
                int min_idx = i;
                for(int j = i+1; j < data.length; j++)
                    if(data[j] < data[min_idx])
                        min_idx = j;
                int t = data[min_idx];
                data[min_idx] = data[i];
                data[i] = t;
            }
        }
        public void insertion(int data[]){
            for(int i = 0; i<data.length; i++){
                int key = data[i];
                int j = i-1;
                while(j>=0 && data[j] > key){
                    data[j+1] = data[j];
                    j = j-1;
                }
                data[j+1] = key;
            }
        }
        public void bubble(int data[]){
            for(int i = 0; i < data.length-1; i++){
                for(int j = 0; j < data.length-i-1; j++)
                    if(data[j] > data[j+1]){
                        int t = data[j];
                        data[j] = data[j+1];
                        data[j+1] = t;
                    }
            }
        }
}