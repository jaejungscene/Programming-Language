from cgi import test
import pyautogui as gui
import time

# size = gui.size()
# print(size)
# print(type(size))

x = 3000
y = 500
flag = True
while True:
    gui.moveTo(x,y)
    gui.mouseDown()
    gui.mouseUp()
    if flag:
        y += 10
        flag = False
    else:
        y -= 10
        flag = True
    time.sleep(10)


# gui.keyDown("shift")
# gui.keyDown("command")
# gui.press("3")
# gui.keyUp('shift')
# gui.keyUp('command')

# gui.mouseDown()
# gui.mouseUp()