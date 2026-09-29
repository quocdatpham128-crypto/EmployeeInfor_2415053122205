package com.example.employeeinfor_2415053122205

import java.text.NumberFormat
import java.util.Locale

fun NhanVien.layThongTinLuongChuan(luongChuan: Double): String {
    val chechLoch = this.luong - luongChuan
    return if (chechLoch >= 0) {
        "Cao hơn lương chuẩn ${layDinhDangLuong(chechLoch)}"
    } else {
        "Thấp hơn lương chuẩn ${layDinhDangLuong(-chechLoch)}"
    }
}

fun NhanVien.layDinhDangLuong(soTien: Double = this.luong): String {
    val dinhDangTien = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
    return dinhDangTien.format(soTien)
}

fun NhanVien.layTenVietHoa(): String {
    return this.hoTen.uppercase(Locale.getDefault())
}

fun NhanVien.layThongTinTomTat(): String {
    return "Mã NV: ${this.maNhanVien} - Tên: ${layTenVietHoa()} - Chức vụ: ${this.chucVu}"
}

fun NhanVien.layXepLoaiThamNien(): String {
    return when {
        this.thamNien < 2 -> "Nhân viên mới"
        this.thamNien in 2..5 -> "Nhân viên kinh nghiệm"
        this.thamNien in 6..10 -> "Chuyên viên"
        else -> "Lão làng / Nòng cốt"
    }
}