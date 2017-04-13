package pl.writeonly.scala.util

  //FuctionalInterface
object SingleAbstractMethod {
//  implicit def toRunnable(unit: () => Unit) = new Runnable() { def run() = unit() }
 
  implicit def toRunnable(unit:  => Unit) = new Runnable() { def run() = unit }

  //to callbacks
}

  //FuctionalInterface
class SingleAbstractMethod {
  implicit def toRunnable(unit: () => Unit) = new Runnable() { def run() = unit() }
}
