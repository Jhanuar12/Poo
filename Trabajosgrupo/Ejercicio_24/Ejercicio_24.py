#EJERCICIO 24
print("Ingresar peso esfera A")
A= float(input())
print("Ingresar peso esfera B")
B= float(input())
print("Ingresar peso esfera C")
C= float(input())


if A>B and A>C:
  mayor=A
  print("mayor peso: esfera A:", mayor)
elif B>A and B>C:
  mayor=B
  print("mayor peso: esfera B:", mayor)
else:
  mayor=C
  print("mayor peso: esfera C:", mayor)