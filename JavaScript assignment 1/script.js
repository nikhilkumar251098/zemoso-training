const button = document.querySelector('button');

button.onclick = () => {
    const firstName = document.getElementById("name");
    const email = document.getElementById("email");

    if (firstName.value == '' || firstName.value == null) {
        alert("Name can't be empty");
    }

    var patt = new RegExp("^[a-z0-9]\+.\+[@]\.?");
    if (!patt.test(email.value)) {
        alert("please enter the correct email");
    }
}