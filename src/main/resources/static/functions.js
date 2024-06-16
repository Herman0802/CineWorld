function animateString() {
    $("#string1").fadeOut(3000).fadeIn(2000, animateString);
}

function sortTable() {
    let table = document.getElementById('ratingTable').getElementsByTagName('tbody')[0];
    let rows = Array.from(table.rows);

    rows.sort((a, b) => {
        let ratingA = parseFloat(a.cells[3].innerText);
        let ratingB = parseFloat(b.cells[3].innerText);
        let votesA = parseInt(a.cells[4].innerText);
        let votesB = parseInt(b.cells[4].innerText);

        if (ratingA !== ratingB) {
            return ratingB - ratingA;
        } else {
            return votesB - votesA;
        }
    });

    // Remove all rows
    while (table.firstChild) {
        table.removeChild(table.firstChild);
    }

    // Add sorted rows with position numbers
    rows.forEach((row, index) => {
        row.cells[0].innerText = (index + 1).toString();
        table.appendChild(row);
    });
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
