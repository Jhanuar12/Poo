#EJERCICIO 19
from math import sqrt
print("inserte valor del lado de triangulo equilatero")
L= float(input())
PER= 3*L
ALT= (sqrt(3)*L)/2
AREA= (L*ALT)/2
print("perimetro:", PER)
print("altura:", ALT)
print("area:", AREA)
