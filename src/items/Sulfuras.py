from src.Items.NormalItem import *

'''
This class will be for Sulfuras, legendary item.
'''

class Sulfuras(NormalItem):

    def __init__(self, name, sell_in, quality):

        Item.__init__(self, name, sell_in, quality)

    # Override new updateQuality method
    def updateQuality(self):
        
        self.quality = 80