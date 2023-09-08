print("ingrese Número de inscripción")
NI= float(input())
print("ingrese Nombres")
NOM= input()
print("ingrese valor Patrimonio")
PAT= float(input())
print("ingrese Estrato social")
EST=int(input())

PM= 50000
if PAT>2000000 and EST>3:
  PM =50000+ (PAT*0.03) #3%
print(PM)
print("El estudiante con número de inscripcion", NI, "y nombre", NOM, "debe pagar: $ ",PM)