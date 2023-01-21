from src.GildedRose import *
from test.test_variables import items_day_one, items_day_thirty
import pytest

@pytest.fixture
def shop():

    test_gildedRose = GildedRose(items_day_one)
    return test_gildedRose
    
@pytest.mark.test_updateInventory
def test_updateInventory(shop):
    
    for i in range(1,30):

        shop.updateInventory()

    for j in range(0,9):
            
            
        assert shop.items[j].name == items_day_thirty[j].name
        assert shop.items[j].sell_in == items_day_thirty[j].sell_in
        assert shop.items[j].quality == items_day_thirty[j].quality