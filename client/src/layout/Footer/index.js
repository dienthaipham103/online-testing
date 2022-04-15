import React from 'react';
import './Footer.scss';

function Footer(props) {
    return (
        <div className='footer'>
            <div className='footer_content'>
                <p>Website Thi Online là một trang web giúp nhà trường quản lý việc thi cử của sinh viên
                    dễ dàng hơn!
                </p>
            </div>

            <div className='footer_contact'>
                <p style={{ fontWeight: 'bold' }}>TMA Solutions</p>
                <p>10 Đặng Văn Ngữ, Phường 10, Phú Nhuận, Thành phố Hồ Chí Minh</p>
            </div>
        </div>
    );
}

export default Footer;