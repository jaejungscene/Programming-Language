import cv2
import numpy as np
import time
import base64
from PIL import Image
import numpy as np
import io
import tqdm

iter_num = 300

np_array = np.random.randint(0, 256, (2000, 2024, 3), dtype=np.uint8)




print("===== Np array To Base64 =====")




# total_start_time = time.time()

# for i in tqdm.tqdm(range(iter_num)):
#     start_time = time.time()
#     image = Image.fromarray(np_array)
#     # print(f"np array to PIL image:         {(time.time() - start_time) * 1000:.2f} ms")

#     start_time = time.time()
#     buffered = io.BytesIO()
#     image.save(buffered, format="JPEG")
#     img_bytes = buffered.getvalue()
#     # print(f"PIL image to byte:             {(time.time() - start_time) * 1000:.2f} ms")

#     start_time = time.time()
#     img_base64 = base64.b64encode(img_bytes).decode('utf-8')
#     # print(f"byte to base64 :               {(time.time() - start_time) * 1000:.2f} ms")

# print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")




print("="*100)




# total_start_time = time.time()

# for i in tqdm.tqdm(range(iter_num)):
#     start_time = time.time()
#     success, jpg_np_array = cv2.imencode('.jpg', np_array)
#     print(f"np array encode jpg np array:  {(time.time() - start_time) * 1000:.2f} ms")

#     start_time = time.time()
#     byte_image = jpg_np_array.tobytes()
#     print(f"jpg np array to byte :         {(time.time() - start_time) * 1000:.2f} ms")

#     start_time = time.time()
#     base64_image = base64.b64encode(byte_image).decode('utf-8')
#     print(f"byte to base64 :               {(time.time() - start_time) * 1000:.2f} ms")

# print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")


success, jpg_np_array = cv2.imencode('.jpg', np_array)
byte_image = jpg_np_array.tobytes()
base64_image = base64.b64encode(byte_image).decode('utf-8')



print("="*100)


print("===== Base64 To Np array =====")



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
    image_array = np.asarray(image)
    # print(f"PIL image to np array:         {(time.time() - start_time) * 1000:.2f} ms")

print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")




total_start_time = time.time()

for i in tqdm.tqdm(range(iter_num)):
    start_time = time.time()
    byte_image = base64.b64decode(base64_image)
    # print(f"base64 to byte :               {(time.time() - start_time) * 1000:.2f} ms")


    start_time = time.time()
    encoded_img = np.fromstring(byte_image, dtype = np.uint8) # type: ignore
    # print(f"byte to PIL image :            {(time.time() - start_time) * 1000:.2f} ms")

    start_time = time.time()
    img_cv = cv2.imdecode(encoded_img, cv2.IMREAD_COLOR)
    # print(f"PIL image to np array:         {(time.time() - start_time) * 1000:.2f} ms")

print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")







# total_start_time = time.time()

# for i in tqdm.tqdm(range(iter_num)):
#     start_time = time.time()
#     byte_image = base64.b64decode(base64_image)
#     # print(f"base64 to byte :               {(time.time() - start_time) * 1000:.2f} ms")

#     start_time = time.time()
#     byte_stream = io.BytesIO(byte_image)
#     image = Image.open(byte_stream)
#     # print(f"byte to PIL image :            {(time.time() - start_time) * 1000:.2f} ms")

#     start_time = time.time()
#     image_array = np.array(image)
#     # print(f"PIL image to np array:         {(time.time() - start_time) * 1000:.2f} ms")

# print(f"average time :             {((time.time() - total_start_time) * 1000)/(i+1):.2f} ms")