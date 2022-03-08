import {ReactComponent as StarFull} from 'Assent/Img/star-full.svg';
import {ReactComponent as StarHalf} from 'Assent/Img/Start-Half.svg';
import {ReactComponent as StarEmpty} from 'Assent/Img/star-Empty.svg';
import './Style.css';
function Moviestar() {
    return(
<div className="dsmovie-stars-container">
  <StarFull />
  <StarFull />
  <StarFull />
  <StarHalf />
  <StarEmpty />
</div>
    );
}

export default Moviestar;