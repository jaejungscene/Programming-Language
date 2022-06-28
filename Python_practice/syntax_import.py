import sys, os
sys.path.append("/Users/jaejungscene/Projects/Machine_Learning")
print("\n", os.pardir)
from test.Functions import step_function
import numpy as np

y = step_function(x = np.array([1,-1]))
print(y)