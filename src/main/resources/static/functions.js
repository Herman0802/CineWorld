function animateString() {
    $("#service-name").fadeOut(3000).fadeIn(2000, animateString);
}

function formatNumber(id) {
    const element = document.getElementById(id);
    const number = parseInt(element.innerText, 10);
    element.innerText = number.toLocaleString('en-US').replace(/,/g, ' ');
}

function formatVotes() {
    const voteElements = document.querySelectorAll('.votes');
    voteElements.forEach(element => {
        const votes = parseInt(element.innerText, 10);
        element.innerText = votes.toLocaleString('en-US').replace(/,/g, ' ');
    });
}
