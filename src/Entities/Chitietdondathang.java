package Entities;
// Generated Dec 17, 2016 4:50:57 PM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Chitietdondathang generated by hbm2java
 */
@Entity
@Table(name = "chitietdondathang", catalog = "qlbantuisach")
public class Chitietdondathang implements java.io.Serializable {

	private Integer idCtddh;

	private int maDonDatHang;

	private int maSanPham;

	private int soLuong;

	private long donGia;

	private long thanhTien;

	public Chitietdondathang() {
	}

	public Chitietdondathang(int maDonDatHang, int maSanPham, int soLuong, long donGia, long thanhTien) {
		this.maDonDatHang = maDonDatHang;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_CTDDH", unique = true, nullable = false)
	public Integer getIdCtddh() {
		return this.idCtddh;
	}

	public void setIdCtddh(Integer idCtddh) {
		this.idCtddh = idCtddh;
	}

	@Column(name = "MaDonDatHang", nullable = false)
	public int getMaDonDatHang() {
		return this.maDonDatHang;
	}

	public void setMaDonDatHang(int maDonDatHang) {
		this.maDonDatHang = maDonDatHang;
	}

	@Column(name = "MaSanPham", nullable = false)
	public int getMaSanPham() {
		return this.maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	@Column(name = "SoLuong", nullable = false)
	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Column(name = "DonGia", nullable = false, precision = 18, scale = 0)
	public long getDonGia() {
		return this.donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	@Column(name = "ThanhTien", nullable = false, precision = 18, scale = 0)
	public long getThanhTien() {
		return this.thanhTien;
	}

	public void setThanhTien(long thanhTien) {
		this.thanhTien = thanhTien;
	}

}