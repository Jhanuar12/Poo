#EJERCICIO 13
print("ingrese valor de la compra")
VC= float(input())
print("ingrese color de la bolita")
bolita= input()

if bolita == "BLANCA":
  PD=0
elif bolita== "VERDE":
  PD=10
elif bolita == "AMARILLA":
  PD=25
elif bolita == "AZUL":
  PD=50
else:
  PD=100

VP = VC - (PD*VC/100)
print("EL CLIENTE DEBE PAGA: $", VP)