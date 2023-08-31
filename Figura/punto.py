
class Punto:
    
    def __init__(self, x = 0, y = 0):
        self.__x = x
        self.__y = y


    def get_x(self):
        return (self.__x)
    
    
    def get_y(self):
        return (self.__y)
    

    def set_x(self, x):
        self.__x = x


    def set_y(self, y):
        self.__y = y


    def __str__(self):
        return '(' + x + ',' + y + ')'
