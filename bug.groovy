```groovy
def myMethod(arg1, arg2) {
  if (arg1 == null) {
    arg1 = 0  // Correct way to handle null
  }
  println arg1 + arg2
}

myMethod(null, 5)
myMethod(10, 5) 
```