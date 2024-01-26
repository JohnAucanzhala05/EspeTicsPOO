class Animal:
    def comer(self):
        print("El animal está comiendo")

class Ave(Animal):
    def volar(self):
        print("El animal está volando")

class Mamifero(Animal):
    def amamantar(self):
        print("El animal está amamantando")

class Murcielado(Mamifero,Ave):
    pass

murcielago = Murcielado()

murcielago.comer()
murcielago.amamantar()
murcielago.volar()
