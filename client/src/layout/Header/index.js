import './Header.scss';
import { Link } from 'react-router-dom';
import { useState } from 'react';


function Header(props) {

    const [active, setActive] = useState({
        home: 'active',
        account: null,
        comment: null,
        exam: null
    })

    const handleActive = (prop) => {
        setActive({ ...active, home: null, account: null, comment: null, exam: null, [prop]: 'active' });
    }

    return (
        <div>
            <div className='logo'>
                <img src='https://pubweb.vn/public/image/2020/12/29/1609258702_85529_logo-bong-01-01png.png'
                    width={200} height={80} />
            </div>
            <div className='containerNav'>
                <nav className="bodyNav">
                    <ul>
                        <li>
                            <Link to="#" style={{ textDecoration: 'none' }}>
                                <p className={'title ' + active.home} style={{ borderLeft: 'none' }} onClick={() => handleActive('home')}>Trang chủ</p>
                            </Link>
                        </li>
                        <li style={{ borderLeft: '1px solid #D0D0D0' }}>
                            <Link to="#" style={{ textDecoration: 'none' }}>
                                <p className={'title ' + active.account} onClick={() => handleActive('account')}>Tài khoản</p>
                            </Link>
                        </li>
                        <li style={{ borderLeft: '1px solid #D0D0D0' }}>
                            <Link to="#" style={{ textDecoration: 'none' }}>
                                <p className={'title ' + active.comment} onClick={() => handleActive('comment')} >Đóng góp</p>
                            </Link>
                        </li>
                        <li style={{ borderLeft: '1px solid #D0D0D0' }}>
                            <Link to="#" style={{ textDecoration: 'none' }}>
                                <p className={'title ' + active.exam} onClick={() => handleActive('exam')}>Thi thử</p>
                            </Link>
                        </li>
                    </ul>
                </nav>
            </div >
        </div>
    );
}

export default Header;