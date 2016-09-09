package pl.writeonly.scala.util

object SingleAbstractMethod {
  implicit def toRunnable(unit: () => Unit) = new Runnable() { def run() = unit() }
}

class SingleAbstractMethod {
  implicit def toRunnable(unit: () => Unit) = new Runnable() { def run() = unit() }
}
