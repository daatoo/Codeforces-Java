public class List {
    public int info;
    public List next;
    public List(int x, List l){
        info = x;
        next = l;
    }
    public List(int x){
        info = x;
        next = null;
    }

    //public methods
    public void insert(int x){
        next = new List(x);
    }
    public void delete(){
        if(next != null){
            next = next.next;
        }
    }
    public static boolean isEmpty(List l){
        if(l == null){
            return true;
        }else{
            return false;
        }
    }
    public static String toString(List l){
        if(l == null){
            return "[]";
        }else{
            return l.toString();
        }
    }
    public String toString(){
        String result = "["+info;
        for(List t = next; t != null; t=t.next){
            result = result + ", " + t.info;
        }
        return result + "]";
    }

    public static List arrayToList(int[] a){ // [4, 6, 8, 10]
        List result = null;
        for(int i = a.length-1; i>=0; i--){
            result = new List(a[i], result);
        }
        return result;
    }

    public int[] listToArray(){
        List t = this;
        int n = length();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = t.info;
            t = t.next;
        }
        return a;

    }
    private int length(){
        int result = 1;
        for(List t = next; t != null; t=t.next){
            result++;
        }
        return result;
    }
    public static List merge(List a, List b){
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        if(b.info > a.info){
            a.next = merge(a.next, b); // 1 merge in b
            return a;
        }else{
            b.next = merge(a, b.next);
            return b;
        }
    }


    // sorting by merging
    public static List sort(List a){ // 17 -> 0 -> -3 -> 7 -> 9 -> 1
        if(a == null || a.next == null){
            return a;
        }
        List b = a.half();
        a = sort(a);
        b = sort(b);
        return  merge(a,b);
    }
    public List half(){
        if(next == null) return null;
        List result = next;
        next = next.half();
        return result;
    }
}

