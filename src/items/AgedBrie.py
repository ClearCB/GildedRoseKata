from src.Items.NormalItem import *

'''
We will create a class called 'Aged brie', in which we will inheritance the class
NormalItem but overriding the method updateQuality adapting it to each product
'''

class AgedBrie:
    
    # Constructor, inheritated from Item class.
    def __init__(self, name, sell_in, quality):

        Item.__init__(self, name, sell_in, quality)

    # Override the method updateQuality
    def updateQuality(self):

        if self.sell_in >= 0:
            self.setQuality(+1)

        else:
            self.setQuality(+2)