import { IUser } from 'app/shared/model/user.model';
import { ITag } from 'app/shared/model/tag.model';

export interface IItem {
  id?: number;
  name?: string | null;
  price?: number | null;
  distance?: number | null;
  description?: string | null;
  login?: IUser | null;
  tags?: ITag[] | null;
}

export const defaultValue: Readonly<IItem> = {};
