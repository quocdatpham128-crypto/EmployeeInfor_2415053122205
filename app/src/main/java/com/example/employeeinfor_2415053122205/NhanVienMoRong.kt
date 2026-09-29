package com.example.employeeinfor_2415053122205

import java.text.NumberFormat
import java.util.Locale

// Extension function so sánh với lương chuẩn
fun NhanVien.layThongTinLuongChuan(luongChuan: Double): String {
    val chechLoch = this.luong - luongChuan
    return if (chechLoch >= 0) {
        "Cao hơn lương chuẩn ${layDinhDangLuong(chechLoch)}"
    } else {
        "Thấp hơn lương chuẩn ${layDinhDangLuong(-chechLoch)}"
    }
}

// Extension function định dạng tiền tệ VNĐ
fun NhanVien.layDinhDangLuong(soTien: Double = this.luong): String {
    val dinhDangTien = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
    return dinhDangTien.format(soTien)
}

// Extension function viết hoa tên
fun NhanVien.layTenVietHoa(): String {
    return this.hoTen.uppercase(Locale.getDefault())
}

// Extension function tóm tắt thông tin nhân viên
fun NhanVien.layThongTinTomTat(): String {
    return "Mã NV: ${this.maNhanVien} - Tên: ${layTenVietHoa()} - Chức vụ: ${this.chucVu}"
}

// Extension function xếp loại thâm niên
fun NhanVien.layXepLoaiThamNien(): String {
    return when {
        this.thamNien < 2 -> "Nhân viên mới"
        this.thamNien in 2..5 -> "Nhân viên kinh nghiệm"
        this.thamNien in 6..10 -> "Chuyên viên"
        else -> "Lão làng / Nòng cốt"
    }
}