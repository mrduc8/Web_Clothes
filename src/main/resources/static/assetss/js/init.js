$(document).ready(function () {
    $(".boxscroll").niceScroll({cursorborder: "", cursorcolor: "#eff3f6", boxzoom: true});

    $('#datatable').DataTable();

    var table = $('#datatable-buttons').DataTable({
        pageLength: 100,
        pagingType: 'full_numbers',
        lengthChange: false,
        buttons: ['excel', 'pdf', 'print']
    });

    table.buttons().container().appendTo('#datatable-buttons_wrapper .col-md-6:eq(0)');

        // Lấy tất cả các thẻ td có class "align-center"
        const tdElements = document.querySelectorAll('td.align-center');
        let total = 0;

        // Duyệt qua các thẻ td và tính tổng
        tdElements.forEach(td => {
        const valueText = td.textContent.trim(); // Lấy nội dung text
        const value = parseFloat(valueText.replace('VNĐ', '').replace(',', '')); // Loại bỏ "VNĐ" và chuyển thành số
        if (!isNaN(value)) {
        total += value; // Cộng dồn giá trị
    }
    })
    ;

        // Hiển thị tổng vào thẻ <h5> với class "mt-0 mb-1"
        const totalElement = document.querySelector('h5.mt-0.mb-1');
        if (totalElement) {
            totalElement.textContent = `${total.toLocaleString()} VNĐ`; // Hiển thị kết quả với dấu phân cách
        }


});