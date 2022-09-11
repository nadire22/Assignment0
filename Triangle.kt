abstract class Triangle (_name:String): Shape(_name) {
    val height = 5.0;
    val base = 10;

    var TriangleArea = 0.0;
    
    open override fun getArea(): Double {
        TriangleArea = (height * base) / 2 ;
        return getArea()
    }
}