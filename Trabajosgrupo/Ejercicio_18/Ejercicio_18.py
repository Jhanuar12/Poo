#EJERCICIO 18
print("inserte codigo empleado")
COD=float(input())
print("inserte nombre empleado")
NOM= input()
print("inserte horas trabajadas/mes")
HT= float(input())
print("inserte valor por hora trabajada")
VH= float(input())
print("inserte porcentaje de retencion en la fuente")
R= float(input())
SB=HT*VH
RF= SB*(R/100)
SN= SB-RF

print("nombre:", NOM)
print("codigo:", COD)
print("salario bruto:", SB)
print("salaria neto:", SN)