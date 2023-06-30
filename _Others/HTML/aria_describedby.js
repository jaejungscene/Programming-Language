// Optional: Add event listeners for multiple elements
var popupContainers = document.getElementsByClassName("popup-container");
for (var i = 0; i < popupContainers.length; i++) {
  var popupContainer = popupContainers[i];
  
  // Show the pop-up on mouseover
  popupContainer.addEventListener("mouseover", function(event) {
    var popup = event.target.querySelector(".popup");
    if (popup) {
      popup.style.display = "block";
    }
  });
  
  // Hide the pop-up on mouseout
  popupContainer.addEventListener("mouseout", function(event) {
    var popup = event.target.querySelector(".popup");
    if (popup) {
      popup.style.display = "none";
    }
  });
}

/**
어떤 html 파일 안에 "<span style="max-width: 95px;" class="d-block badge bg-light border border-dark dark:border-white border-opacity-10 text-dark fw-normal text-truncate w-100 py-1.5" data-bs-toggle="tooltip" data-bs-boundary="viewport" data-bs-html="true">Set Approval For...</span>"
이러한 "Set Approval For ..."이라는 text를 보여주는 element가 있는데 이 element에 마우스를 올리면
"<span style="max-width: 95px;" class="d-block badge bg-light border border-dark dark:border-white border-opacity-10 text-dark fw-normal text-truncate w-100 py-1.5" data-bs-toggle="tooltip" data-bs-boundary="viewport" data-bs-html="true" aria-describedby="tooltip79156">Set Approval For...</span>"
과 같이 element가 바뀌면서 "Set Approval For ..." text애 대한 전체 문장인 "Set Approval For All"이 동적으로 보여진다.
이러한 상황에서 bs4라이브러리를 이용해 이 html파일 안에서 "Set Approval For All" 외에도 이와 같은 팝업 하는 전체 문장을 scraping할 수 있는 방법은 무엇일까?
 */

