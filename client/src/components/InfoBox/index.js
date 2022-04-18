import React from 'react';
import './InfoBox.scss';

function InfoBox({number, text}) {
    return (
        <div className='infoBox-wrapper'>
            <div className='infoBox-number'>{number}</div>
            <div className='infoBox-text'>{text}</div>
        </div>
    );
}

export default InfoBox;