class Persona:
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, new_nombre):
        self._nombre = new_nombre

    @nombre.deleter
    def nombre(self):
        del self._nombre

dalto = Persona("John", 22)
nombre = dalto.nombre
print(nombre)

dalto.nombre = "Anderson"
nombre = dalto.nombre
print(nombre)

del dalto.nombre

print("que haces , como estas")
