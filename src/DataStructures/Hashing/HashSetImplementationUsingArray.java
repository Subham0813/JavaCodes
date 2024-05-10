package DataStructures.Hashing;

class MyHashSet {
    int[] nums = new int[1000];
    int i;

    public MyHashSet() {

    }

    public void add(int key) {
        int collisionCount = 0;
        i = key % 1000;
        if(nums[i] == 0) nums[i] = key;
        else {                          // here we're using linear probing technique to avoid collision
            while(nums[i] > 0){
                collisionCount++;
                i = ((key % 1000) + collisionCount) % 1000;
            }
            nums[i] = key;
        }
    }

    public void remove(int key) {
        int collisionCount = 0;
        i = key % 1000;
        if(nums[i] == key) nums[i] = 0;
        else {                          // here we're using linear probing technique to avoid collision
            while(nums[i] != key){
                collisionCount++;
                i = ((key % 1000) + collisionCount) % 1000;
            }
            nums[i] = 0;
        }
    }

    public boolean contains(int key) {
        for(int ele : nums){
            if(ele == key) return true;
        }
        return false;
    }
}

public class HashSetImplementationUsingArray {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.add(2);
        System.out.println(obj.contains(1));
        System.out.println(obj.contains(3));
        obj.add(2);
        System.out.println(obj.contains(2));
        obj.remove(2);
        System.out.println(obj.contains(2));
    }
}
