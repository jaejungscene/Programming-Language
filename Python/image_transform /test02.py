import cv2
import numpy as np
import time
import base64
from PIL import Image
import numpy as np
import io
import tqdm

iter_num = 1

# np_array = np.random.randint(0, 256, (2000, 2024, 3), dtype=np.uint8)
np_array = cv2.imread("/Users/jaejungscene/Projects/Programming-Playground/Python/image/image-2.jpg")
cv2.imwrite('origin.png', np_array)
np_array = cv2.cvtColor(np_array, cv2.COLOR_BGR2RGB)
print(np_array.shape, np_array[0][0], np_array[0][1])


print("===== Np array To Base64 =====")

total_start_time = time.time()

for i in tqdm.tqdm(range(iter_num)):
    start_time = time.time()
    success, jpg_np_array = cv2.imencode('.jpg', np_array)
    # print(f"np array encode jpg np array:  {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    byte_image = jpg_np_array.tobytes()
    # print(f"jpg np array to byte :         {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    base64_image = base64.b64encode(byte_image).decode('utf-8')
    # print(f"byte to base64 :               {(time.time() - start_time) * 1000:.2f} ms")

print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")



"""
이게 더 빠름
"""
total_start_time = time.time()

for i in tqdm.tqdm(range(iter_num)):
    start_time = time.time()
    image = Image.fromarray(np_array)
    # print(f"np array to PIL image:         {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    buffered = io.BytesIO()
    image.save(buffered, format="JPEG")
    img_bytes = buffered.getvalue()
    # print(f"PIL image to byte:             {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    base64_image = base64.b64encode(img_bytes).decode('utf-8')
    # print(f"byte to base64 :               {(time.time() - start_time) * 1000:.2f} ms")

print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")

















print("===== Base64 To Np array =====")


total_start_time = time.time()

for i in tqdm.tqdm(range(iter_num)):
    start_time = time.time()
    byte_image = base64.b64decode(base64_image)
    # print(f"base64 to byte :               {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    encoded_img = np.frombuffer(byte_image, dtype = np.uint8)
    # print(f"byte to PIL image :            {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    image_array = cv2.imdecode(encoded_img, cv2.IMREAD_COLOR)
    # print(f"PIL image to np array:         {(time.time() - start_time) * 1000:.2f} ms")

print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")
print(image_array.shape, image_array[0][0], image_array[0][1])
cv2.imwrite('image_saved02.png', image_array)




total_start_time = time.time()

for i in tqdm.tqdm(range(iter_num)):
    start_time = time.time()
    byte_image = base64.b64decode(base64_image)
    # print(f"base64 to byte :               {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    byte_stream = io.BytesIO(byte_image)
    image = Image.open(byte_stream)
    # print(f"byte to PIL image :            {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    image_array = np.array(image)
    # print(f"PIL image to np array:         {(time.time() - start_time) * 1000:.2f} ms")

print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")
print(image_array.shape, image_array[0][0], image_array[0][1])
cv2.imwrite('image_saved01.png', image_array)


