import kotlin.math.sqrt

abstract class EquilateralTriangle(_name:String): Triangle(_name) {
    val side = 5.0;
    val y = (sqrt(3.0) / 4.0)


    var EquilateralTriangleArea = 0.0;
    fun sqrt(x: Int) {

    }
    open override fun getArea(): Double {
        EquilateralTriangleArea = (side * side) *  y ;
        return getArea()
    }
}