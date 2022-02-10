//package InHomeAssignment;
//
//public class FindingWrong_10 {
//}
//
//class Nice {
//    public int x;
//}
//
//class NotNice {
//    final Nice n;
////    public NotNice() {
////        n = new Nice();  //final Nice n = new Nice();
////    }
//    public NotNice(Nice n) {
//        this.n = n;  //final Nice n = new Nice();
//    }
//    public void callMe() {
//        n.x = 13;
//    }
//    public void callMe(Nice n) {
////        this.n = n;
//    }
//    public static void main(String[] args) {
////        NotNice nn = new NotNice();
//        Nice n = new Nice();
//        NotNice nn = new NotNice(n);
//        nn.callMe();
////        nn.callMe(n);
//    }
//}
//
//
/*
class Nice {
    public int x;
}

class NotNice {
    final Nice n;

    public NotNice(Nice n) {
        this.n = n;  // final Nice n = new Nice();
    }
    public void callMe() {
        n.x = 13;
    }

    public static void main(String[] args) {
        Nice n = new Nice();
        NotNice nn = new NotNice(n); //passing ref. variable n
        nn.callMe();
    }
}
 */