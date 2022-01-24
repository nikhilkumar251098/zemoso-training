var galleryElements = [];

function getAddImageElement() {
    var galleryId = "add-image";
    return `<div ALIGN="center" class="gallery-element" id="${galleryId}">
    <form onsubmit="addGallery('${galleryId}');">
    <img src="default.jpeg" onerror="imgOnError(this);"></img>
    <br>URL: <input type="url" id="url.${galleryId}" required>
    <br>Name: <input id="name.${galleryId}" required>
    <br>Information: <input id="info.${galleryId}" required>
    <br><input type="submit" class="buttons" value="Add">
    </form>
    </div>`;
}

function addGallery(galleryId) {
    var url = document.getElementById(`url.${galleryId}`).value;
    var name = document.getElementById(`name.${galleryId}`).value;
    var info = document.getElementById(`info.${galleryId}`).value;
    var uploadedDate = (new Date()).toISOString();

    document.getElementById(galleryId).remove();
    var galleryBox = document.querySelector("#content-main");
    var galleryElement = {
        Image: url,
        Name: name,
        Information: info,
        UploadedDate: uploadedDate
    };

    galleryElements.push(galleryElement);

    var newGalleryId = `galleryId.${galleryElements.length - 1}`;
    var newGalleryElement = document.createElement('div');
    newGalleryElement.innerHTML = `<div ALIGN="center" class="gallery-element" id="${newGalleryId}">
    <img id="image.${newGalleryId}" src="${galleryElement.Image}" onerror="imgOnError(this);"></img>
    <br><button type="button" class="buttons" onclick="deleteGallery('${newGalleryId}');">Delete</button>
    <br>URL: <input id="url.${newGalleryId}" value="${galleryElement.Image}" type="url" required>
    <br>Name: <input id="name.${newGalleryId}" value="${galleryElement.Name}"></input>
    <br>Information: <input id="info.${newGalleryId}" value="${galleryElement.Information}"></input>
    <br>UploadedDate: <span id="uploadeddate.${newGalleryId}">${galleryElement.UploadedDate}</span>
    </div>`;
    galleryBox.appendChild(newGalleryElement.firstChild);

    var newAddGalleryElement = document.createElement('div');
    newAddGalleryElement.innerHTML = getAddImageElement();
    galleryBox.appendChild(newAddGalleryElement.firstChild);
}

function imgOnError(img) {
    img.onerror = null;
    img.src = "default.jpeg";
}

function disableButton(btn) {
    btn.disabled = true;
    btn.style.visibility = 'hidden';
    btn.style.display = 'none';
}

function enableButton(btn) {
    btn.disabled = false;
    btn.style.visibility = 'visible';
    btn.style.display = 'block';
}

function deleteGallery(galleryElementId) {
    document.getElementById(galleryElementId).remove();
}

function editGallery() {
    //enableButton(document.getElementById("save-button"));
    disableButton(document.getElementById("edit-button"));
    var html = ``;
    for (var id = 0; id < galleryElements.length; id++) {
        var galleryId = `galleryId.${id}`;
        var galleryElement = galleryElements[id];
        html += `<div ALIGN="center" class="gallery-element" id="${galleryId}">
        <img id="image.${galleryId}" src="${galleryElement.Image}" onerror="imgOnError(this);"></img>
        <br><button type="button" class="buttons" onclick="deleteGallery('${galleryId}');">Delete</button>
        <br>URL: <input id="url.${galleryId}" value="${galleryElement.Image}"></input>
        <br>Name: <input id="name.${galleryId}" value="${galleryElement.Name}"></input>
        <br>Information: <input id="info.${galleryId}" value="${galleryElement.Information}"></input>
        <br>UploadedDate: <span id="uploadeddate.${galleryId}">${galleryElement.UploadedDate}</span>
        </div>`;
    }
    html += getAddImageElement();
    document.querySelector("#content-main").innerHTML = html;
}

function saveGallery() {
    //enableButton(document.getElementById("edit-button"));
    var updatedGalleryElements = [];
    var galleryBox = document.querySelector("#content-main");
    galleryBox.querySelectorAll(".gallery-element").forEach(child => {
        var galleryId = child.id;
        if (galleryId != "add-image") {
            updatedGalleryElements.push({
                Image: document.getElementById(`url.${galleryId}`).value,
                Name: document.getElementById(`name.${galleryId}`).value,
                Information: document.getElementById(`info.${galleryId}`).value,
                UploadedDate: document.getElementById(`uploadeddate.${galleryId}`).innerHTML
            });
        }
    });
    galleryElements = updatedGalleryElements;
    console.log(galleryElements);
    refreshContentMain();
    //disableButton(document.getElementById("save-button"));
}

function refreshContentMain() {
    var html = ``;
    for (var id = 0; id < galleryElements.length; id++) {
        var galleryId = `galleryId.${id}`;
        var galleryElement = galleryElements[id];
        html += `<div ALIGN="center" class="gallery-element" id="${galleryId}">
                            <img id="image.${galleryId}" src="${galleryElement.Image}" onerror="imgOnError(this);"></img>
                            <br>Name: <span id="name.${galleryId}">${galleryElement.Name}</span>
                            <br>Information: <span id="info.${galleryId}">${galleryElement.Information}</span>
                            <br>UploadedDate: <span id="uploadeddate.${galleryId}">${galleryElement.UploadedDate}</span>
                            </div>`;
    }
    document.querySelector("#content-main").innerHTML = html;
}

function initializeBody() {
    fetch("gallery.json")
        .then(response => response.json())
        .then(data => {
            galleryElements = data;
            refreshContentMain();
            //disableButton(document.getElementById("save-button"));
        });
}