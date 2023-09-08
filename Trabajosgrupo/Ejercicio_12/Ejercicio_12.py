#EJERCICIO 12
print("ingrese nombre del trabajador")
NOM= input()
print("ingrese número de horas trabajadas")
HT= float(input())
print("ingrese valor hora de trabajo")
VH= float(input())

if HT >40:
  HE=HT-40
  if HE>8:
    HES=HE-8
    SAL=40*VH+16*VH+HES*3*VH
  else:
    SAL=40*VH+HE*2*VH
else:
  SAL= HT*VH
print("EL TRABAJADOR", NOM, "DEVENGO: $", SAL)