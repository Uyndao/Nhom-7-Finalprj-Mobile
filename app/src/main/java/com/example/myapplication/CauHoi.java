package com.example.myapplication;

import java.util.Vector;

public class CauHoi {
    int id;
    String cauhoi;
    String luachon1;
    String luachon2;
    String luachon3;
    String luachon4;
    String dapan;
    int dokho;
    public CauHoi(){

    }

    public CauHoi(int id, String cauhoi, String luachon1, String luachon2, String luachon3, String luachon4, String dapan, int dokho) {
        this.id = id;
        this.cauhoi = cauhoi;
        this.luachon1 = luachon1;
        this.luachon2 = luachon2;
        this.luachon3 = luachon3;
        this.luachon4 = luachon4;
        this.dapan = dapan;
        this.dokho = dokho;
    }

    public Vector<CauHoi> KhoiTaoDiaLy() {
        Vector<CauHoi> vector = new Vector<CauHoi>();
        vector.add(new CauHoi(1, "Quốc gia nào là quốc gia lớn nhất thế giới về diện tích?", "Trung Quốc", "Nga", "Mỹ", "Ấn Độ", "Nga", 0));
        vector.add(new CauHoi(2, "Đại dương nào lớn nhất trên trái đất?", "Đại Tây Dương", "Thái Bình Dương", "Đại Bắc Dương", "Đại Nam Dương", "Thái Bình Dương", 0));
        vector.add(new CauHoi(3, "Dãy núi nào cao nhất thế giới?", "Himalaya", "Alps", "Rocky Mountains", "Andes", "Himalaya", 0));
        vector.add(new CauHoi(4, "Thành phố nào được biết đến là 'Thành phố Ánh sáng'?", "Paris", "New York", "Tokyo", "Sydney", "Paris", 0));
        vector.add(new CauHoi(5, "Sông nào là sông dài nhất thế giới?", "Sông Nile", "Sông Amazon", "Sông Mississippi", "Sông Yangtze", "Sông Amazon", 0));
        vector.add(new CauHoi(6, "Nước nào là quốc gia có dân số đông nhất thế giới?", "Trung Quốc", "Ấn Độ", "Mỹ", "Indonesia", "Trung Quốc", 1));
        vector.add(new CauHoi(7, "Đỉnh núi Everest, núi cao nhất thế giới, nằm ở ranh giới giữa hai quốc gia nào?", "Nepal và Bhutan", "Nepal và Ấn Độ", "Nepal và Trung Quốc", "Nepal và Pakistan", "Nepal và Trung Quốc", 1));
        vector.add(new CauHoi(8, "Quốc gia nào nằm ở bán đảo Scandinavia?", "Phần Lan", "Thụy Điển", "Na Uy", "Đan Mạch", "Thụy Điển", 1));
        vector.add(new CauHoi(9, "Thành phố nào được biết đến là 'Thủ đô của thế giới' do có nhiều tổ chức quốc tế đặt trụ sở tại đây?", "New York", "Geneva", "Brussels", "Vienna", "Geneva", 1));
        vector.add(new CauHoi(10, "Hồ nước lợ được biết đến nhiều nhất ở quốc gia nào?", "Mỹ", "Canada", "Nga", "Na Uy", "Canada", 1));
        return vector;
    }

    public Vector<CauHoi> KhoiTaoLichSu() {
        Vector<CauHoi> vector = new Vector<CauHoi>();
        vector.add(new CauHoi(11, "Sự kiện nào được coi là nguyên nhân chính dẫn đến Thế chiến I?", "Ám sát Archduke Franz Ferdinand", "Ký hiệp định Versailles", "Quốc sự nổ ra ở Poland", "Chiến tranh Xô Viết - Finland", "Ám sát Archduke Franz Ferdinand", 0));
        vector.add(new CauHoi(12, "Ai là nhà lãnh đạo của Cuộc cách mạng Công nghiệp?", "Napoleon Bonaparte", "Mao Zedong", "Karl Marx", "Abraham Lincoln", "Karl Marx", 0));
        vector.add(new CauHoi(13, "Sự kiện nào đánh dấu sự kết thúc Chiến tranh thế giới thứ II ở châu Âu?", "Nagasaki và Hiroshima bị đánh bom nguyên tử", "Sự kiện D-Day", "Chuyến tàu không chiến Berlin", "Sự kiện Battle of Stalingrad", "Nagasaki và Hiroshima bị đánh bom nguyên tử", 0));
        vector.add(new CauHoi(14, "Ai là người sáng lập Đế chế La Mã?", "Alexander Đại đế", "Julius Caesar", "Cleopatra", "Romulus và Remus", "Romulus và Remus", 0));
        vector.add(new CauHoi(15, "Sự kiện nào đánh dấu sự kết thúc Chiến tranh lạnh?", "Ký hiệp định Paris", "Sự kiện Cuban Missile Crisis", "Sụp đổ của Bức tường Berlin", "Sự kiện Tet Offensive", "Sụp đổ của Bức tường Berlin", 0));
        vector.add(new CauHoi(16, "Ai là người sáng lập Đế chế Maurya ở Ấn Độ cổ đại?", "Chandragupta Maurya", "Ashoka the Great", "Alexander the Great", "Harsha", "Chandragupta Maurya", 1));
        vector.add(new CauHoi(17, "Sự kiện nào đánh dấu sự kết thúc Chiến tranh Việt Nam?", "Sự kiện Mỹ Lai", "Paris Peace Accords", "Chiến dịch Hồ Chí Minh", "Sự kiện Gulf of Tonkin", "Paris Peace Accords", 1));
        vector.add(new CauHoi(18, "Nước nào là quê hương của nhà ngoại giao và chính trị gia Nelson Mandela?", "Nigeria", "Kenya", "South Africa", "Ghana", "South Africa", 1));
        vector.add(new CauHoi(19, "Ai là vị vua nổi tiếng của Ai Cập cổ đại xây dựng đền thờ Khufu ở Giza?", "Tutankhamun", "Ramses II", "Hatshepsut", "Khufu", "Khufu", 1));
        vector.add(new CauHoi(20, "Ai là tổng thống Hoa Kỳ đầu tiên?", "Thomas Jefferson", "George Washington", "John Adams", "James Madison", "George Washington", 1));
        return vector;
    }

    public Vector<CauHoi> KhoiTaoKhoaHoc() {
        Vector<CauHoi> vector = new Vector<CauHoi>();
        vector.add(new CauHoi(21, "Nguyên tử có bao nhiêu loại hạt cơ bản?", "2", "3", "4", "5", "3", 0));
        vector.add(new CauHoi(22, "Loại năng lượng nào được tạo ra từ quá trình hạt nhân hợp?", "Năng lượng nhiệt", "Năng lượng điện", "Năng lượng hạt nhân", "Năng lượng hấp thụ", "Năng lượng hạt nhân", 0));
        vector.add(new CauHoi(23, "Kim loại nào là nguyên tố quang hợp trong quá trình quang hợp của thực vật?", "Sắt", "Kẽm", "Đồng", "Magiê", "Magiê", 0));
        vector.add(new CauHoi(24, "Nguyên tố hóa học nào có ký hiệu là 'O'?", "Osmium", "Oxygen", "Oganesson", "Osmium", "Oxygen", 0));
        vector.add(new CauHoi(25, "Loại tia nào có bước sóng ngắn nhất trong quang phổ điện từ?", "Tia gamma", "Tia X", "Tia tử ngoại", "Tia cực ngắn", "Tia gamma", 0));
        vector.add(new CauHoi(26, "Năng lượng mặt trời được chuyển đổi thành năng lượng gì trong quá trình quang hợp?", "Năng lượng điện", "Năng lượng nhiệt", "Năng lượng hóa học", "Năng lượng cơ học", "Năng lượng hóa học", 1));
        vector.add(new CauHoi(27, "Loại tia nào không thể thấy bằng mắt nh naked eye?", "Tia X", "Tia tử ngoại", "Tia hồng ngoại", "Tia gamma", "Tia gamma", 1));
        vector.add(new CauHoi(28, "Nguồn gốc của loài người hiện đại được tìm thấy ở lục địa nào?", "Châu Âu", "Châu Phi", "Châu Á", "Châu Mỹ", "Châu Á", 1));
        vector.add(new CauHoi(29, "Công thức hóa học CO2 biểu diễn cho chất gì?", "Oxi", "Carbon dioxide", "Canxi oxit", "Clo", "Carbon dioxide", 1));
        vector.add(new CauHoi(30, "Loại pin nào thường được sử dụng trong các thiết bị di động như điện thoại di động?", "Pin kiềm", "Pin axit chì", "Pin lithium-ion", "Pin niken-cadmium", "Pin lithium-ion", 1));
        return vector;
    }

    public Vector<CauHoi> KhoiTaoNgheThuat() {
        Vector<CauHoi> vector = new Vector<CauHoi>();
        vector.add(new CauHoi(31, "Bức tranh nổi tiếng 'Mona Lisa' do nghệ sĩ nào sáng tác?", "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet", "Leonardo da Vinci", 0));
        vector.add(new CauHoi(32, "Loại nghệ thuật nào nổi tiếng với việc sử dụng đá để tạo hình?", "Sơn dầu", "Điêu khắc", "Mộc nghệ thuật", "Mosaic", "Điêu khắc", 0));
        vector.add(new CauHoi(33, "Ballet là một dạng nghệ thuật thuộc lĩnh vực nào?", "Âm nhạc", "Múa", "Hội họa", "Diễn xuất", "Múa", 0));
        vector.add(new CauHoi(34, "Tác phẩm 'Sáo trúc vàng' là của nghệ sĩ nghệ thuật nào?", "Nguyễn Gia Trí", "Nguyễn Tường Lân", "Trần Văn Cẩn", "Đỗ Quang Em", "Nguyễn Gia Trí", 0));
        vector.add(new CauHoi(35, "Điện ảnh nước nào nổi tiếng với dòng phim Kinh điển 'Cô gái đến từ hôm qua'?", "Pháp", "Ý", "Hàn Quốc", "Nhật Bản", "Pháp", 0));
        vector.add(new CauHoi(36, "Bức tranh nào của Vincent van Gogh nổi tiếng với các chấm sáng màu vàng?", "Bàn ghế Gauguin", "Đêm sao băng", "Cà phê với ông", "Hoa hướng dương", "Đêm sao băng", 1));
        vector.add(new CauHoi(37, "Ai là tác giả của bản giao hưởng nổi tiếng 'Chuông gió'?", "Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Johann Sebastian Bach", "Pyotr Ilyich Tchaikovsky", "Ludwig van Beethoven", 1));
        vector.add(new CauHoi(38, "Tác phẩm nào của William Shakespeare được biết đến là 'Tragedy of Hamlet, Prince of Denmark'?", "Othello", "Macbeth", "Romeo and Juliet", "Hamlet", "Hamlet", 1));
        vector.add(new CauHoi(39, "Ballet nổi tiếng 'Hồ Thiên Nga' được sáng tác bởi ai?", "Pyotr Ilyich Tchaikovsky", "Igor Stravinsky", "Ludwig Minkus", "Sergei Prokofiev", "Pyotr Ilyich Tchaikovsky", 1));
        vector.add(new CauHoi(40, "Ai là người sáng tác tác phẩm điện ảnh 'Nhà nghỉ Bates'?", "Martin Scorsese", "Alfred Hitchcock", "Steven Spielberg", "Francis Ford Coppola", "Alfred Hitchcock", 1));
        return vector;
    }

    public Vector<CauHoi> KhoiTaoTatCa() {
        Vector<CauHoi> vector = new Vector<CauHoi>();
        vector.add(new CauHoi(1, "Quốc gia nào là quốc gia lớn nhất thế giới về diện tích?", "Trung Quốc", "Nga", "Mỹ", "Ấn Độ", "Nga", 0));
        vector.add(new CauHoi(2, "Đại dương nào lớn nhất trên trái đất?", "Đại Tây Dương", "Thái Bình Dương", "Đại Bắc Dương", "Đại Nam Dương", "Thái Bình Dương", 0));
        vector.add(new CauHoi(3, "Dãy núi nào cao nhất thế giới?", "Himalaya", "Alps", "Rocky Mountains", "Andes", "Himalaya", 0));
        vector.add(new CauHoi(4, "Thành phố nào được biết đến là 'Thành phố Ánh sáng'?", "Paris", "New York", "Tokyo", "Sydney", "Paris", 0));
        vector.add(new CauHoi(5, "Sông nào là sông dài nhất thế giới?", "Sông Nile", "Sông Amazon", "Sông Mississippi", "Sông Yangtze", "Sông Amazon", 0));
        vector.add(new CauHoi(6, "Nước nào là quốc gia có dân số đông nhất thế giới?", "Trung Quốc", "Ấn Độ", "Mỹ", "Indonesia", "Trung Quốc", 1));
        vector.add(new CauHoi(7, "Đỉnh núi Everest, núi cao nhất thế giới, nằm ở ranh giới giữa hai quốc gia nào?", "Nepal và Bhutan", "Nepal và Ấn Độ", "Nepal và Trung Quốc", "Nepal và Pakistan", "Nepal và Trung Quốc", 1));
        vector.add(new CauHoi(8, "Quốc gia nào nằm ở bán đảo Scandinavia?", "Phần Lan", "Thụy Điển", "Na Uy", "Đan Mạch", "Thụy Điển", 1));
        vector.add(new CauHoi(9, "Thành phố nào được biết đến là 'Thủ đô của thế giới' do có nhiều tổ chức quốc tế đặt trụ sở tại đây?", "New York", "Geneva", "Brussels", "Vienna", "Geneva", 1));
        vector.add(new CauHoi(10, "Hồ nước lợ được biết đến nhiều nhất ở quốc gia nào?", "Mỹ", "Canada", "Nga", "Na Uy", "Canada", 1));
        vector.add(new CauHoi(11, "Sự kiện nào được coi là nguyên nhân chính dẫn đến Thế chiến I?", "Ám sát Archduke Franz Ferdinand", "Ký hiệp định Versailles", "Quốc sự nổ ra ở Poland", "Chiến tranh Xô Viết - Finland", "Ám sát Archduke Franz Ferdinand", 0));
        vector.add(new CauHoi(12, "Ai là nhà lãnh đạo của Cuộc cách mạng Công nghiệp?", "Napoleon Bonaparte", "Mao Zedong", "Karl Marx", "Abraham Lincoln", "Karl Marx", 0));
        vector.add(new CauHoi(13, "Sự kiện nào đánh dấu sự kết thúc Chiến tranh thế giới thứ II ở châu Âu?", "Nagasaki và Hiroshima bị đánh bom nguyên tử", "Sự kiện D-Day", "Chuyến tàu không chiến Berlin", "Sự kiện Battle of Stalingrad", "Nagasaki và Hiroshima bị đánh bom nguyên tử", 0));
        vector.add(new CauHoi(14, "Ai là người sáng lập Đế chế La Mã?", "Alexander Đại đế", "Julius Caesar", "Cleopatra", "Romulus và Remus", "Romulus và Remus", 0));
        vector.add(new CauHoi(15, "Sự kiện nào đánh dấu sự kết thúc Chiến tranh lạnh?", "Ký hiệp định Paris", "Sự kiện Cuban Missile Crisis", "Sụp đổ của Bức tường Berlin", "Sự kiện Tet Offensive", "Sụp đổ của Bức tường Berlin", 0));
        vector.add(new CauHoi(16, "Ai là người sáng lập Đế chế Maurya ở Ấn Độ cổ đại?", "Chandragupta Maurya", "Ashoka the Great", "Alexander the Great", "Harsha", "Chandragupta Maurya", 1));
        vector.add(new CauHoi(17, "Sự kiện nào đánh dấu sự kết thúc Chiến tranh Việt Nam?", "Sự kiện Mỹ Lai", "Paris Peace Accords", "Chiến dịch Hồ Chí Minh", "Sự kiện Gulf of Tonkin", "Paris Peace Accords", 1));
        vector.add(new CauHoi(18, "Nước nào là quê hương của nhà ngoại giao và chính trị gia Nelson Mandela?", "Nigeria", "Kenya", "South Africa", "Ghana", "South Africa", 1));
        vector.add(new CauHoi(19, "Ai là vị vua nổi tiếng của Ai Cập cổ đại xây dựng đền thờ Khufu ở Giza?", "Tutankhamun", "Ramses II", "Hatshepsut", "Khufu", "Khufu", 1));
        vector.add(new CauHoi(20, "Ai là tổng thống Hoa Kỳ đầu tiên?", "Thomas Jefferson", "George Washington", "John Adams", "James Madison", "George Washington", 1));
        vector.add(new CauHoi(21, "Nguyên tử có bao nhiêu loại hạt cơ bản?", "2", "3", "4", "5", "3", 0));
        vector.add(new CauHoi(22, "Loại năng lượng nào được tạo ra từ quá trình hạt nhân hợp?", "Năng lượng nhiệt", "Năng lượng điện", "Năng lượng hạt nhân", "Năng lượng hấp thụ", "Năng lượng hạt nhân", 0));
        vector.add(new CauHoi(23, "Kim loại nào là nguyên tố quang hợp trong quá trình quang hợp của thực vật?", "Sắt", "Kẽm", "Đồng", "Magiê", "Magiê", 0));
        vector.add(new CauHoi(24, "Nguyên tố hóa học nào có ký hiệu là 'O'?", "Osmium", "Oxygen", "Oganesson", "Osmium", "Oxygen", 0));
        vector.add(new CauHoi(25, "Loại tia nào có bước sóng ngắn nhất trong quang phổ điện từ?", "Tia gamma", "Tia X", "Tia tử ngoại", "Tia cực ngắn", "Tia gamma", 0));
        vector.add(new CauHoi(26, "Năng lượng mặt trời được chuyển đổi thành năng lượng gì trong quá trình quang hợp?", "Năng lượng điện", "Năng lượng nhiệt", "Năng lượng hóa học", "Năng lượng cơ học", "Năng lượng hóa học", 1));
        vector.add(new CauHoi(27, "Loại tia nào không thể thấy bằng mắt nh naked eye?", "Tia X", "Tia tử ngoại", "Tia hồng ngoại", "Tia gamma", "Tia gamma", 1));
        vector.add(new CauHoi(28, "Nguồn gốc của loài người hiện đại được tìm thấy ở lục địa nào?", "Châu Âu", "Châu Phi", "Châu Á", "Châu Mỹ", "Châu Á", 1));
        vector.add(new CauHoi(29, "Công thức hóa học CO2 biểu diễn cho chất gì?", "Oxi", "Carbon dioxide", "Canxi oxit", "Clo", "Carbon dioxide", 1));
        vector.add(new CauHoi(30, "Loại pin nào thường được sử dụng trong các thiết bị di động như điện thoại di động?", "Pin kiềm", "Pin axit chì", "Pin lithium-ion", "Pin niken-cadmium", "Pin lithium-ion", 1));
        vector.add(new CauHoi(31, "Bức tranh nổi tiếng 'Mona Lisa' do nghệ sĩ nào sáng tác?", "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet", "Leonardo da Vinci", 0));
        vector.add(new CauHoi(32, "Loại nghệ thuật nào nổi tiếng với việc sử dụng đá để tạo hình?", "Sơn dầu", "Điêu khắc", "Mộc nghệ thuật", "Mosaic", "Điêu khắc", 0));
        vector.add(new CauHoi(33, "Ballet là một dạng nghệ thuật thuộc lĩnh vực nào?", "Âm nhạc", "Múa", "Hội họa", "Diễn xuất", "Múa", 0));
        vector.add(new CauHoi(34, "Tác phẩm 'Sáo trúc vàng' là của nghệ sĩ nghệ thuật nào?", "Nguyễn Gia Trí", "Nguyễn Tường Lân", "Trần Văn Cẩn", "Đỗ Quang Em", "Nguyễn Gia Trí", 0));
        vector.add(new CauHoi(35, "Điện ảnh nước nào nổi tiếng với dòng phim Kinh điển 'Cô gái đến từ hôm qua'?", "Pháp", "Ý", "Hàn Quốc", "Nhật Bản", "Pháp", 0));
        vector.add(new CauHoi(36, "Bức tranh nào của Vincent van Gogh nổi tiếng với các chấm sáng màu vàng?", "Bàn ghế Gauguin", "Đêm sao băng", "Cà phê với ông", "Hoa hướng dương", "Đêm sao băng", 1));
        vector.add(new CauHoi(37, "Ai là tác giả của bản giao hưởng nổi tiếng 'Chuông gió'?", "Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Johann Sebastian Bach", "Pyotr Ilyich Tchaikovsky", "Ludwig van Beethoven", 1));
        vector.add(new CauHoi(38, "Tác phẩm nào của William Shakespeare được biết đến là 'Tragedy of Hamlet, Prince of Denmark'?", "Othello", "Macbeth", "Romeo and Juliet", "Hamlet", "Hamlet", 1));
        vector.add(new CauHoi(39, "Ballet nổi tiếng 'Hồ Thiên Nga' được sáng tác bởi ai?", "Pyotr Ilyich Tchaikovsky", "Igor Stravinsky", "Ludwig Minkus", "Sergei Prokofiev", "Pyotr Ilyich Tchaikovsky", 1));
        vector.add(new CauHoi(40, "Ai là người sáng tác tác phẩm điện ảnh 'Nhà nghỉ Bates'?", "Martin Scorsese", "Alfred Hitchcock", "Steven Spielberg", "Francis Ford Coppola", "Alfred Hitchcock", 1));
        return vector;
    }
}
