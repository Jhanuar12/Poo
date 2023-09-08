#EJERCICIO 11
print("inserte el primer valor")
N1= int(input())
print("inserte el segundo valor")
N2= int(input())
print("inserte el tercer valor")
N3= int(input())

if N1 >N2 and N1>N3:
  mayor = N1
elif N2 >N1 and N2>N3:
  mayor = N2
else:
  mayor = N3
print("EL VALOR MAYOR ENTRE:", N1,",", N2, "Y", N3, "ES:", mayor)