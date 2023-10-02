// สร้าง function เพื่อดึงข้อมูลจากแหล่ง http://localhost:8200/movies
function fetchMovies() {
    fetch('http://localhost:8200/movies')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            displayMovies(data);
        })
        .catch(error => {
            console.error('There was a problem with the fetch operation:', error);
        });
}

// สร้าง function เพื่อแสดงรายการหนังบนหน้าเว็บ
function displayMovies(movies) {
    const movieList = document.getElementById('movie-list');
    movies.forEach(movie => {
        const listItem = document.createElement('li');
        listItem.textContent = movie.title;
        movieList.appendChild(listItem);
    });
}

// เรียกใช้ function fetchMovies เมื่อหน้าเว็บโหลดเสร็จสมบูรณ์
window.addEventListener('load', fetchMovies);
