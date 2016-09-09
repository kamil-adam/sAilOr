package pl.writeonly.scala.util

  //FuctionalInterface
object SingleAbstractMethod {
  implicit def toRunnable(unit: () => Unit) = new Runnable() { def run() = unit() }
}

  //FuctionalInterface
class SingleAbstractMethod {
  implicit def toRunnable(unit: () => Unit) = new Runnable() { def run() = unit() }
}
