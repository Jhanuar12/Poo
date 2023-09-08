#EJERCICIO 22
print("ingrese nombre de empleado")
name=input()
print("ingrese salario por hora")
sal=float(input())
print("ingrese numero de horas trabajadas en el mes")
hrs=float(input())

if (hrs*sal)>=450000:
  print("nombre:", name, "salario:", (hrs*sal))
else:
  print("nombre:",name)