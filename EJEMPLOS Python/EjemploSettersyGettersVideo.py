class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, new_nombre):
        self.nombre = new_nombre

dalto = Persona("John", 22)
nombre = dalto.get_nombre()
print(nombre)

dalto.set_nombre("Anderson")

nombre = dalto.get_nombre()
print(nombre)
