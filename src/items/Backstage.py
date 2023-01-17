from src.Items.NormalItem import *

'''
This class will create objects of Backstage type
'''

class Backstage(NormalItem):

    def __init__(self, name, sell_in, quality):

        Item.__init__(self, name, sell_in, quality)

    def updateQuality(self):
        
        if 0 < self.sell_in < 5:

            self.setQuality()
        
        elif self.sell_in :

            self.setQuality()
        
        elif self.sell_in :

            self.setQuality()