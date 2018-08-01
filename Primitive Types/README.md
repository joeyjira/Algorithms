# Primitive Types

## Things to know
* Bit-wise operators
  + &, >>, >>>, <<, ~, ^, |
* Constants denoting maximum and minimum values for numeric types
  + Integer.MIN_VALUE
  + Float.MAX_VALUE
  + Double.SIZE
  + Boolean.TRUE
* Box-Types and their factory methods
  + Boolean.valueOf(true)
  + Integer.parseInt("42")
  + Float.toString(-1.23)
* Prefer box-type static comparisons
  + Double.compare(x, 1.23)
* Key methods in Math
  + Math.abs(-34.5)
  + Math.ceil(2.17)
  + Math.floor(3.14)
  + Math.min(x, -4)
  + Math.max(3.14, y)
  + Math.pow(2.71, 3.14)
  + Math.sqrt(225)
* Key methods in Random
  + nextInt(16)
  + nextInt()
  + nextBoolean()
  + nextDouble()

## Problems
* [CountBits](./CountBits/CountBits.java)
  + Count the number of bits that are set to 1 in an integer
