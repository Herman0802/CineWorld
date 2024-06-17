function animateString() {
    $("#service-name").fadeOut(3000).fadeIn(2000, animateString);
}

function formatNumber(id) {
    const element = document.getElementById(id);
    if (element) {
        const number = parseInt(element.innerText, 10);
        if (!isNaN(number)) {
            element.innerText = number.toLocaleString('en').replace(/,/g, ' ');
        }
    }
}

function formatVotes() {
    const voteElements = document.querySelectorAll('.votes-column');
    voteElements.forEach(element => {
        const votes = parseInt(element.innerText, 10);
        if (!isNaN(votes)) {
            element.innerText = votes.toLocaleString('en').replace(/,/g, ' ');
        }
    });
}
