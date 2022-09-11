abstract  class Circle (_name:String): Shape(_name) {
    val radius = 5.0;
    val pi = 3.1415926;

    var CircleArea = 0.0;

//test
    open override fun getArea(): Double {
        CircleArea = (radius * radius) * pi;
        return getArea()
    }
}