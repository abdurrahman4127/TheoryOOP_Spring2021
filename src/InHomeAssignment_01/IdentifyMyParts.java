//package InHomeAssignment;
//
//public class IdentifyMyParts
//{
//    public static int x = 7;
//    public int y = 3;
//
//    public static void main(String[] args)
//    {
//        IdentifyMyParts a = new IdentifyMyParts();
//        IdentifyMyParts b = new IdentifyMyParts();
//
//        a.y = 5;
//        b.y = 6;
//        a.x = 1;  // value changes for all reference under this class
//        b.x = 2;  // updating x = 1 to x = 2; class dependant; not the object
//
//        System.out.println(a.y);
//        System.out.println(b.y);
//        System.out.println(a.x); //statics to the class; not to the object / reference
//        System.out.println(b.x);
//
//        System.out.println(IdentifyMyParts.x);  //accessing static attribute using class name is preferable
//    }
//}