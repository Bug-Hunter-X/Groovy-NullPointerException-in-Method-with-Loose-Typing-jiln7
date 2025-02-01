```groovy
def myMethod(arg1, arg2) {
  // Explicitly check for null and provide a default value
  def arg1ToUse = arg1 ?: 0
  println arg1ToUse + arg2
}

myMethod(null, 5)
myMethod(10, 5)
```