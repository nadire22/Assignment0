abstract open class Square (_name:String): Shape(_name) {
    val height = 5.0;
    val length = 10.0;

    var SquareArea = 0.0;

    open override fun getArea(): Double {
        SquareArea = height * length
        return getArea()

    }

}