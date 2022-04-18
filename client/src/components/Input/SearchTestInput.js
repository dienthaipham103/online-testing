import React from 'react';
import './SearchTestInput.scss';
import SearchIcon from '@mui/icons-material/Search';

function SearchTestInput(props) {
    return (
        <div style={{display: 'flex'}}>
            <input className='searchTest-input' placeholder='Nhập môn thi cần tìm'></input>
            <div className='searchTest-button'>
                <SearchIcon className='searchTest-icon'/>
            </div>
        </div>
    );
}

export default SearchTestInput;